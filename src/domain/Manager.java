package domain;

 /**
 * Клас менеджер розширює клас співробітник
 */ 
public class Manager extends Employee {


/** 
 *
 * Конструктор класу
 *
 * @param employees  the employees. 
 * @param name  the name. 
 * @param jobTitle  the job title. 
 * @param level  the level. 
 * @param dept  the dept. 
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) { 

        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

/** 
 *
 * Повертає рядок підлеглих менеджера
 *
 * @return список робітників
 */
     @Override
    public String toString() { 

        return super.toString()+"\nEmployees: "+getEmployees(); 
    }


/** 
 *
 * Конструктор класу що отримує список робітників
 *
 * @param employees  the employees. 
 */
    public Manager(Employee[] employees) { 

        super();
        this.employees = employees;
    }
    

/** 
 *
 * Конструктор класу що створює пустий масив робітників
 *
 */
    public Manager() { 

        super();
        employees = new Employee[10];
    }

    private Employee[] employees;


/** 
 *
 * Повертає список робітників
 *
 * @return Рядок з іменами робітників
 */
    public String getEmployees() { 

        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }


/** 
 *
 * Встановлює масив робітників
 *
 * @param employees  the employees. 
 */
    public void setEmployees(Employee[] employees) { 

        this.employees=employees;
    }


/** 
 *
 * Повертає масив робітників
 *
 * @return масив робітників
 */
    public Employee[] getEmployeesList() { 

        return employees;
    }

    
}
