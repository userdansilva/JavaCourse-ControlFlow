public class SwitchStatement {
    public static void main(String[] args) {
        newSwitch();
        System.out.println(getPlayerGroup("Daniel"));
        System.out.println(getPlayerGroup("Lucas"));
    }

    public static void newSwitch() {
        int switchValue = 1;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2");
        }
    }

    public static String getPlayerGroup(String name) {
        return switch (name) {
            case "Daniel", "Pedro" -> {
                yield "Group 01";
            }
            case "Carlos", "Debora" -> "Group 02";
            case "Julia", "Alfred" -> "Group 03";
//            default -> "No group assigned";
            default -> {
                String response = "No group assigner";
                yield response;
            }
        };

    }
}
