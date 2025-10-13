package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog1 = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        // 개 병원
        dogHospital.set(dog1);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 ; 개 병원에 고양이 전달
        // dogHospital.set(cat); // 컴파일 에러

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog1);
        dogHospital.bigger(new Dog("뽀삐", 200));

    }
}
