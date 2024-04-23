package domain;

 /**
 * The class Employee
 */ 
public class Employee {

    

/** 
 *
 * Рядок співробітників
 *
 * @return інформація про співробітників
 */
    @Override
    public String toString() { 

        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;


/** 
 *
 * Конструктор класу 
 *
 * @param name  the name. 
 * @param jobTitle  the job title. 
 * @param level  the level. 
 * @param dept  the dept. 
 */
    public Employee(String name, String jobTitle, int level, String dept) { 

        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }


/** 
 *
 * Конструктор класу з випадковим ID співробітника
 *
 */
    public Employee() { 

        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }


/** 
 *
 * Змінити посаду
 *
 * @param job  the job. 
 */
    public void setJobTitle(String job) { 

        jobTitle = job;
    }


/** 
 *
 * Поаертає посаду
 * 
 * @return Назва посади
 */
    public String getJobTitle() { 

        return jobTitle;
    }


/** 
 *
 * Поаертає ім'я
 *
 * @return ім'я робітника
 */
    public String getName() { 

        return name;
    }


/** 
 *
 * Встановлює рівень якщо він в межах від 1 до 3
 *
 * @param level  the level. 
 */
    public void setLevel(int level) { 

        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }


/** 
 *
 * Поаертає рівень
 *
 * @return the level
 */
    public int getLevel() { 

        return level;
    }


/** 
 *
 * Поаертає відділ
 *
 * @return назва відділу
 */
    public String getDept() { 

        return dept;
    }


/** 
 *
 * Встановлює відділ
 *
 * @param dept  the dept. 
 */
    public void setDept(String dept) { 

        this.dept = dept;
    }


/** 
 *
 * Встановлює ім'я з перевіркою правильності імені
 *
 * @param name  the name. 
 */
    public void setName(String name) { 

//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
