package enums;

public enum FilePath {
    USER_LIST_PATH("data\\User.csv"),
    ORDER_PATH("data\\Order.csv"),
    ORDER_ITEM_PATH("data\\OrderItem.csv"),
    PRODUCT_LIST_PATH("data\\ProductList.csv"),
    ALL_ORDER_PATH("data\\AllOrder.csv"),
    CREATE_USER_PATH("data\\CreateUser.csv"),
    DATE_ORDER_PATH("data\\DayOrder.csv"),
    SAVE_USER_PATH("data\\SaveUser.csv"),
    OLD_ORDER_PATH("data\\ShowOldOrder.csv");
    private String path;

    private FilePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
