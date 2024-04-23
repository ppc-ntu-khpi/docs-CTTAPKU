package domain;


 /**
 * Клас художник що розширює клас співробітник
 */ 
public class Artist extends Employee {


/** 
 *
 * Конструктор класу
 *
 * @param skiils  the skiils. 
 * @param name  the name. 
 * @param jobTitle  the job title. 
 * @param level  the level. 
 * @param dept  the dept. 
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) { 

        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }


/** 
 *
 * Конструктор класу що приймає масив навичок
 *
 * @param skiils  the skiils. 
 */
    public Artist(String[] skiils) { 

        super();
        this.skiils = skiils;
    }
    

/** 
 *
 * Конструктор що створює пустий масив навичок
 */
    public Artist() { 

        super();
        this.skiils = new String[10];
    }

    

/** 
 *
 * Отримати навички у вигляді рядку
 *
 * @return повертає навички у вигляді строки
 */
    @Override
    public String toString() { 

        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;


/** 
 *
 * Отримати навички
 *
 * @return повертає список навичок
 */
    public String getSkills() { 

        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }


/** 
 *
 * Встановити навички
 *
 * @param skills  the skills. 
 * 
 */
    public void setSkills(String[] skills) { 

        this.skiils=skills;
    }


/** 
 *
 * Отримати навички
 *
 * @return повертає список навичок
 */
    public String[] getSkillsLSist() { 

        return skiils;
    }
}
