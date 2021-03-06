package decoration.decorator;

import decoration.Cake;

/**
 * 具体装饰角色（Concrete Decorator）
 * 牛肉手抓饼
 */
public class BeefCakeDecorator extends CakeDecorator{

    public BeefCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "牛肉" + super.nameDetails();
    }

    @Override
    public double price() {
        return super.price() + 2.0;
    }
}
