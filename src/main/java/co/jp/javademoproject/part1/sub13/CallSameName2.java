package co.jp.javademoproject.part1.sub13;

import co.jp.javademoproject.part1.sub13.package1.StringUtils;

public class CallSameName2 {

    public static void main(String[] args) {
        StringUtils.getName();
        co.jp.javademoproject.part1.sub13.package2.StringUtils.getName();
    }
}
