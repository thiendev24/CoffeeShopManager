package surface;

import product.ProductManagement;
import order.*;
import user.UserManagement;
import utils.AddOrderItemInAllOrder;
import utils.BackMenuOrExit;
import utils.TotalPrice;

import java.util.List;
import java.util.Scanner;

public class OptionSadmin {
    private final static String PATCH_ALLORDER = "D:\\vscode\\module2\\CSModule2\\CSModule2\\data\\AllOrder.csv";
    static AddOrderItemInAllOrder addOrderItemInAllOrder = new AddOrderItemInAllOrder();
    static BackMenuOrExit backMeNuOrExit = new BackMenuOrExit();
    static TotalPrice totalPrice = new TotalPrice();
    public static void optionSadmin() {

        int choice = -1;
        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 8) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Quản lí Thực Đơn" + "              " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2. Quản lí người dùng" + "            " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3. Quản lí đơn đặt hàng" + "          " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            System.out.printf("︻┳═一 :");
            choice = Integer.parseInt(scanner.nextLine());
            RenderListView renderList = new RenderListView();
            switch (choice) {
                case 1:
                    renderList.renderMenuManager();
                    ProductManagement foodManager = new ProductManagement();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            foodManager.renderProduct();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;

                        case 2:
                            foodManager.addProduct();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 3:
                            foodManager.removeProduct();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 4:
                            foodManager.editProduct();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 5:
                            foodManager.searchName();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 6:
                            foodManager.sortAscending();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 7:
                            foodManager.sortDescending();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 8:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 1;
                    }
                    break;
                case 2:
                    renderList.renderUserManager();
                    UserManagement user = new UserManagement();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            UserManagement.addUser();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 2:
                            user.editUser();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 3:
                            UserManagement.renderUser();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 4:
                            user.removeUser();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 5:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 2;
                    }
                    break;
                case 3:
                    renderList.renderOrderManager();
                    OrderManager orderManager = new OrderManager();
                    OrderItemManager orderItemManager = new OrderItemManager();
                    AllOrderManager allOrderManager = new AllOrderManager();
                    DayOrderManager dayOrderManager = new DayOrderManager();
                    System.out.println("Vui lòng nhập lựa chọn của bạn: ");
                    System.out.printf("︻┳═一 :");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1: //hiển thị tổng oder
                            allOrderManager.renderAllOrder();
                            totalPrice.TotalAllOrderPrice();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 2: // hiển thị order theo ngày
                            dayOrderManager.SortByDayOrder();
                            totalPrice.TotalDayPrice();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 3: //thêm đơn đặt hàng
                            orderManager.addOrder();
                            orderItemManager.addOrderItem();
                            orderManager.renderOder();
                            orderItemManager.renderOrderItem();
                            totalPrice.TotalOrderItemPrice();
                            addOrderItemInAllOrder.AddOrderItemInAllOrder();
                            backMeNuOrExit.BackMeNuOrExitSadmin();
                            break;
                        case 4:// sửa đơn đặt hàng
                            orderItemManager.editOrderItem();
                            addOrderItemInAllOrder.AddOrderItemInAllOrder();
                            System.out.println("Nhấn 1 để in hóa đơn hoặc 2 để về menu chính và 0 để thoát !! ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    orderManager.renderOder();
                                    orderItemManager.renderOrderItem();
                                    totalPrice.TotalOrderItemPrice();
                                    backMeNuOrExit.BackMeNuOrExitSadmin();
                                    break;
                                case 2:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để in hóa đơn hoặc 0 để order tiếp ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 5: //xóa đơn đặt hàng
                            orderItemManager.deleteOrderItem();
                            List<OrderItem> orderItemListDelete = OrderItemManager.findAll();
                            List<Order> orderListDelete = OrderManager.findAll();
                            addOrderItemInAllOrder.AddOrderItemInAllOrder();
                            System.out.println("Nhấn 1 để in hóa đơn hoặc 2 để về menu chính và 0 để thoát !! ");
                            System.out.printf("︻┳═一 :");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    orderManager.renderOder();
                                    orderItemManager.renderOrderItem();
                                    totalPrice.TotalOrderItemPrice();
                                    backMeNuOrExit.BackMeNuOrExitSadmin();
                                    break;
                                case 2:
                                    OptionSadmin.optionSadmin();
                                    break;
                                case 0:
                                    System.out.println("Hẹn Gặp Lại!!!");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Vui Lòng Nhập Lại!");
                                    System.out.println("Nhấn 1 để in hóa đơn hoặc 0 để order tiếp ");
                                    System.out.printf("︻┳═一 :");
                                    choice = Integer.parseInt(scanner.nextLine());
                            }
                            break;
                        case 6:
                            OptionSadmin.optionSadmin();
                            break;
                        case 0:
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Vui Lòng Nhập Lại!");
                            choice = 3;
                    }
                    break;
                case 0:
                    System.out.println("Hẹn Gặp Lại!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Lại!");
                    OptionSadmin.optionSadmin();

            }
        }
    }
}

