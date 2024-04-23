package domain;

 /**
 * Клас Редактор що розширює Художника
 */ 
public class Editor extends Artist {


/** 
 *
 * Конструктор класу
 *
 * @param electronicEditing  the electronic editing. 
 * @param skiils  the skiils. 
 * @param name  the name. 
 * @param jobTitle  the job title. 
 * @param level  the level. 
 * @param dept  the dept. 
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) { 

        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }


/** 
 *
 * Конструктор класу що приймає булеве значення електронного редагування та список навичок
 *
 * @param electronicEditing  the electronic editing. 
 * @param skiils  the skiils. 
 */
    public Editor(boolean electronicEditing, String[] skiils) { 

        super(skiils);
        this.electronicEditing = electronicEditing;
    }


/** 
 *
 * Конструктор класу що приймає булеве значення електронного редагування
 *
 * @param electronicEditing  the electronic editing. 
 */
    public Editor(boolean electronicEditing) { 

        super();
        this.electronicEditing = electronicEditing;
    }
    

/** 
 *
 * Конструктор класу що встановлює значення електронного редагування true
 *
 */
    public Editor() { 

        super();
        this.electronicEditing = true;
    }



/** 
 *
 * Отрмати інформацію про тип редагування у вигляді рядку
 *
 * @return повертає рядок про тип редагування редактора
 */
    @Override
    public String toString() { 

        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;


/** 
 *
 * повертає значення чи використовує редактор електронний спосіб редагування
 *
 * @return булеве значення засобу редагування
 */
    public boolean getPreferences() { 

        return electronicEditing;
    }


/** 
 *
 * Встановлює тип редагування
 *
 * @param electronic  the electronic. 
 */
    public void setPreferences(boolean electronic) { 

        this.electronicEditing=electronic;
    }
}
