package creational.abstract_factory;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.car_branch_factory.CarFactory;
import creational.abstract_factory.car_branch_factory.implementations.IndiaCarFactory;
import creational.abstract_factory.car_branch_factory.implementations.ThaiCarFactory;
import creational.abstract_factory.car_branch_factory.implementations.UsaCarFactory;

public class Client {
    public static void main(String[] args){
        CarFactory carFactory;
        Car carProduct;

        System.out.println("This is Car Product from usa!");
        carFactory = new UsaCarFactory();
        carProduct = carFactory.getCar();
        System.out.println(carProduct.getDescrption());

        System.out.println("This is Car Product from india!");
        carFactory = new IndiaCarFactory();
        carProduct = carFactory.getCar();
        System.out.println(carProduct.getDescrption());

        System.out.println("This is Car Product from Thailand!");
        carFactory = new ThaiCarFactory();
        carProduct = carFactory.getCar();
        System.out.println(carProduct.getDescrption());
    }
}