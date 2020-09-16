package homeWork_5.task_2;

public class WeakStorageDeviceFactory extends StorageDeviceFactory {
    @Override
    public Component create() {
        return new StorageDevice("Seagate", 300, TypeDrive.HDD, "2.5\'");
    }
}
