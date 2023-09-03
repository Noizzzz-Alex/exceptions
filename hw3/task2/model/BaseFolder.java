package hw3.task2.model;
import java.util.LinkedList;
import java.util.List;

/** Абстрактный класс описывающий базовую папку,
 *  включает в себя уникальный id , имя папки,
 *  путь к папке, а также содержить в себе
 *  двусвязный список с имеющимися в ней(папке) файлами и папками.
 */

public abstract class BaseFolder {
    protected final String id;
    protected String name;
    protected String path;
    protected List<BaseFile> filesInsideFolder = new LinkedList<>();

    public BaseFolder(String id, String name, String path, List<BaseFile> filesInsideFolder) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.filesInsideFolder = filesInsideFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<BaseFile> getFilesInsideFolder() {
        return filesInsideFolder;
    }

}


