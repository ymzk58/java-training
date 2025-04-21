public interface CleaningService {
    Shirt washShirt(Shirt s);
    Towl washTowl(Towl t);
    Coat washCoat(Coat c);
}
/*Shirtはどういうクラスか分からんが、
 *引数がShirt型で返り値がShirt型になるwashShirtというメソッドがある*/