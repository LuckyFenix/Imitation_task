
public class ImitationTask
{
    public static void main(String[] args)
    {
        Orc orc = new Orc("Garok");
        Human human = new Human("Merfi");

        textEquals(orc.getDamage(), human.getDamage(),
                "Орк " + orc.getName() + " наносит больше урона, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " наносит меньше урона, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " наносят равный урон");

        textEquals(orc.getDefense(), human.getDefense(),
                "Орк " + orc.getName() + " имеет больше защиты, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " имеет меньшее защиты, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " имеют одинаковую");

        textEquals(orc.getHp(), human.getHp(),
                "Орк " + orc.getName() + " имеет больше здоровя, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " имеет меньшее здоровя, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " имеют одинаковый запас здоровя");

        textEquals(orc.getStamina(), human.getStamina(),
                "Орк " + orc.getName() + " имеет больше выносливости, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " имеет меньшее выносливости, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " имеют одинаковый запас выносливости");

        textEquals(orc.getMp(), human.getMp(),
                "Орк " + orc.getName() + " имеет больше маны, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " имеет меньшее маны, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " имеют одинаковый запас маны");

        textEquals(orc.getAs(), human.getAs(),
                "Орк " + orc.getName() + " наносит удары быстрее, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " наносит удары медленнее, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " наносят удары одинаково быстро");


        textEquals(orc.getMs(), human.getMs(),
                "Орк " + orc.getName() + " бегает быстрее, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " бегает медленнее, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " бегают одинаково быстро");

        textEquals(orc.getEvasion(), human.getEvasion(),
                "Орк " + orc.getName() + " уклоняется эффективно, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " уклоняется менее эффективно, чем Человек " + human.getName(),
                "Орк " + orc.getName() + " и Человек " + human.getName() + " уклоняются одинаково эффективно");

    }

    private static void textEquals(double d1, double d2, String strD1more, String strD2more, String equal)
    {
        if (d1 > d2)
        {
            System.out.println(strD1more);
        }
        if (d1 < d2)
        {
            System.out.println(strD2more);
        }
        if (d1 == d2)
        {
            System.out.println(equal);
        }
    }
}
