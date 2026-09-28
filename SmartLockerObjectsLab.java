public class SmartLockerObjectsLab {

    static class Parcel {
        String parcelId;
        double weightKg;

        Parcel(String parcelId, double weightKg) {
            this.parcelId = parcelId;
            this.weightKg = weightKg;
        }
    }

    static class Locker {
        int lockerNumber;
        Parcel parcel;

        Locker(int lockerNumber) {
            this.lockerNumber = lockerNumber;
        }

        void assign(Parcel p) {
            this.parcel = p;
        }

        void collect() {
            this.parcel = null;
        }

        boolean isEmpty() {
            return parcel == null;
        }
    }

    static class Recipient {
        String name;

        Recipient(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Parcel parcel = new Parcel("PKG-301", 2.5);
        Locker locker = new Locker(7);
        Recipient recipient = new Recipient("Asha");

        locker.assign(parcel);

        System.out.println(
            parcel.parcelId + " assigned to locker "
            + locker.lockerNumber + " for " + recipient.name
        );

        locker.collect();

        System.out.println(
            parcel.parcelId + " collected; locker "
            + locker.lockerNumber + " is empty=" + locker.isEmpty()
        );
    }
}