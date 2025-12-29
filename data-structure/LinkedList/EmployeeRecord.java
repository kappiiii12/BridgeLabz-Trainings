class EmployeeNode {
    int id;
    String name;
    String department;
    double salary;
    EmployeeNode next;

    public EmployeeNode(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.next = null;
    }
}
public class EmployeeRecord {
    private EmployeeNode head; 

    public void addBegining(int id, String name, String department, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
        newNode.next = head;
        head = newNode;
    }
    public void deleteBegining() {
        if (head == null) {
            System.out.println("Employee Record is Empty!");
            return;
        }
        head = head.next; // This correctly moves the starting point
    }
    public void addLast(int id, String name, String department, double salary) {
        EmployeeNode newNode = new EmployeeNode(id, name, department, salary);
        if (head == null) {
            head = newNode;
            return;
        }
        EmployeeNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deleteLast() { 
        if (head == null) {
            System.out.println("Record is Empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        EmployeeNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void displayEmployeeRecord() {
        EmployeeNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + " | Name: " + temp.name);
            temp = temp.next;
        }
    }
    public void addSpecificPosition(int position, int id, String name, String department, double salary) {
    EmployeeNode newNode = new EmployeeNode(id, name, department, salary);

    // Case 1: Inserting at the beginning (Position 1)
    if (position <= 1) {
        newNode.next = head;
        head = newNode;
        return;
    }

    EmployeeNode current = head;
    // Case 2: Traverse to the node right before the target position
    for (int i = 1; i < position - 1 && current != null; i++) {
        current = current.next;
    }

    // Case 3: If the position is out of bounds (beyond the end of the list)
    if (current == null) {
        System.out.println("Position out of range. Adding to the end of the list instead.");
        addLast(id, name, department, salary); // Fallback to addLast
    } else {
        // Case 4: Standard insertion
        newNode.next = current.next;
        current.next = newNode;
    }
}
public void deleteSpecificPosition(int position) {
    if (head == null) {
        System.out.println("Record is Empty!");
        return;
    }

    // Case 1: Deleting the first node
    if (position == 1) {
        head = head.next;
        return;
    }

    EmployeeNode current = head;
    // Traverse to the node just BEFORE the one we want to delete
    for (int i = 1; i < position - 1 && current != null; i++) {
        current = current.next;
    }

    // Case 2: Position is invalid or the node to delete doesn't exist
    if (current == null || current.next == null) {
        System.out.println("Position is out of bounds.");
    } else {
        // Case 3: Skip the target node
        current.next = current.next.next;
    }
}
public boolean search(int targetId) {
    EmployeeNode temp = head;
    while (temp != null) {
        if (temp.id == targetId) {
            System.out.println("Employee Found: " + temp.name + " (" + temp.department + ")");
            return true;
        }
        temp = temp.next;
    }
    System.out.println("Employee with ID " + targetId + " not found.");
    return false;
}
 public static void main(String[] args) {
    // 1. Create the Manager object
    EmployeeRecord record = new EmployeeRecord();

    // 2. Add employees through the manager
    record.addBegining(1, "Kapil", "CSE", 25000);
    record.addLast(2, "Rahul", "IT", 30000);
    record.addSpecificPosition(2, 3, "Priya", "HR", 28000);

    // 3. Display the records
    System.out.println("--- Employee List ---");
    record.displayEmployeeRecord();

    // 4. Test Search
    System.out.println("\nSearching for ID 3:");
    record.search(3);

    // 5. Test Delete
    System.out.println("\nDeleting position 2...");
    record.deleteSpecificPosition(2);
    record.displayEmployeeRecord();
}
}