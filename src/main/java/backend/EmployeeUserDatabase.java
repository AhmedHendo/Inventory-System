
package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeUserDatabase  extends Database{

    public EmployeeUserDatabase(String fileName) {
        super(fileName);

    }
    public EmployeeUser createRecordFrom(String line)
    {
        String data[]=line.split(",");
        String employeeId=data[0];
        String name=data[1];
        String email=data[2];
        String address=data[3];
        String phoneNumber=data[4];
        return new EmployeeUser(employeeId,name,email,address,phoneNumber);
    }
}



