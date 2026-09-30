
package backend;

public class EmployeeUser implements Record{
    private final String employeeId;
    private final String name;
    private final String email;
    private final String address;
    private final String phoneNumber;    

    @Override
    public String toString() {
        return employeeId + "," + name + "," + email + "," + address + "," + phoneNumber;
    }

    public EmployeeUser(String employeeId, String name, String email, String address, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String lineRepresentation()
    {
        return employeeId+","+name+","+email+","+address+","+phoneNumber;
    }
        public String getSearchKey(){
            return employeeId; 
    }

    }


