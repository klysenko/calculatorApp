package com.company;

import com.company.enums.PlaneTypes;

public class Main {

    public static void main(String[] args) {

        Plane plane = new Plane(1, 27, "ab", PlaneTypes.BOING_747);
        Plane plane1 = new Plane(2, 26, "abc", PlaneTypes.BOING_747);
        Plane plane6 = new Plane(2, 26, "abc", PlaneTypes.BOING_747);
        Plane plane2 = new Plane(1, 25, "abcd", PlaneTypes.BOING_999);
        Plane plane3 = new Plane(3, 24, "agreat", PlaneTypes.BOING_747);
        Plane plane4 = new Plane(4, 23, "ar", PlaneTypes.BOING_747);
        Plane plane5 = new Plane(5, 22, "great", PlaneTypes.BOING_747);

        Plane [] planes = {plane, plane1, plane2, plane3, plane4, plane5};
        Plane [] withTypeBoing747 = new Plane[planes.length];
        Plane [] withTypeBoing999 = new Plane[planes.length];

        int lessThan25Count = 0;
        int withGreatInNameCount = 0;

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getType().equals(PlaneTypes.BOING_747)) {
                withTypeBoing747[i] = planes[i];
            }

            if (planes[i].getType().equals(PlaneTypes.BOING_999)) {
                withTypeBoing999[i] = planes[i];
            }

            if (planes[i].getWings() < 25) {
                lessThan25Count = lessThan25Count + 1;
            }

            if (planes[i].getName().matches("(.*)great(.*)")) {
                withGreatInNameCount = withGreatInNameCount + 1;
            }
        }
    }
}
