package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

public class GetLibraryUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public GetLibraryUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getLibrary());
    }
}
