package hw3.task2.model;

/**
 * Абстрактный класс описывающий базовый файл,
 * включает в себя уникальный id, имя файла, расширение,
 * а так же содержит в себе путь к файлу
 */
public abstract class BaseFile {
    protected final String id;
    protected String name;
    protected String extension;
    protected String path;


    public BaseFile(String id, String name, String extension, String path) {
        this.id = id;
        this.name = name;
        this.extension = extension;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
