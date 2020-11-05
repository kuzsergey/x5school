package homeWork_5.task_2;

public class GamingStorageDeviceFactory implements StorageDeviceFactory {
    @Override
    public Component create() {
        return new StorageDevice("Samsung", 2, TypeDrive.SSD, "2.5\"");
    }
}
