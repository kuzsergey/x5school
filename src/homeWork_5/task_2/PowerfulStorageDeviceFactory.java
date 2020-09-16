package homeWork_5.task_2;

public class PowerfulStorageDeviceFactory extends StorageDeviceFactory {
    @Override
    public Component create() {
        return new StorageDevice("Samsung",2,TypeDrive.SSD,"2.5\"");
    }
}
