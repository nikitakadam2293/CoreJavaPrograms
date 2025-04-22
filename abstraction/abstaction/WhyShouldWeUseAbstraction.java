package abstraction.abstaction;
/*
* eat();
* kid   Adult-kid  Adult  GP
* eat() ==> Indian way of eating
*       ==> Western way of eating
* */
abstract class WayOfEating
{
    abstract void eat();
}
class IndianWayofeating extends WayOfEating
{

    @Override
    void eat() {
        System.out.println("Indian Peaople eat using Hand");
    }
}
class WesternWayOfEating extends WayOfEating
{

    @Override
    void eat() {
        System.out.println("Western people eat using forks/spoon");
    }
}
public class WhyShouldWeUseAbstraction {
}
