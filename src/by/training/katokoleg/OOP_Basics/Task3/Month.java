package Task3;

public enum Month implements Vesocosable {

    JANUARY("January", 1) {
        public int containDays(int year) {
            return 31;
        }
    },
    FEBRUARY("February", 2) {

        public int containDays(int year) {
            return isVesocos(year) ? 29 : 28;
        }
    },
    MARCH("March", 3) {
        public int containDays(int year) {
            return 31;
        }
    },
    APRIL("April", 4) {
        public int containDays(int year) {
            return 30;
        }
    },
    MAY("May", 5) {
        public int containDays(int year) {
            return 31;
        }
    },
    JUNE("June", 6) {
        public int containDays(int year) {
            return 30;
        }
    },
    JULY("July", 7) {
        public int containDays(int year) {
            return 31;
        }
    },
    AUGUST("August", 8) {
        public int containDays(int year) {
            return 31;
        }
    },
    SEPTEMBER("September", 9) {
        public int containDays(int year) {
            return 30;
        }
    },
    OCTOBER("October", 10) {
        public int containDays(int year) {
            return 31;
        }
    },
    NOVEMBER("November", 11) {
        public int containDays(int year) {
            return 30;
        }
    },
    DECEMBER("December", 12) {
        public int containDays(int year) {
            return 31;
        }
    };

    private String name;
    private int orderNumber;

    Month(String name, int orderNumber) {
        this.name = name;
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean isVesocos(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
