package org.application;

import org.domain.Cart;
import org.domain.Item;
import org.domain.Product;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product applePencil=new Product("Apple Pencil");

        Product sonyWirelessHeadphone=new Product("Sony Wireless headphone");
        Item applePencilItem1 = new Item(applePencil,1);
        Item applePencilItem2 = new Item(applePencil,1);
        Item sonyHeadphoneItem = new Item(sonyWirelessHeadphone,2);


        cart.add(applePencilItem1);
        cart.add(sonyHeadphoneItem);
        cart.remove(applePencilItem1);
        cart.add(applePencilItem2);
        cart.showRemovedItems();
        cart.showItemsInCart();

        Cart cart1=new Cart();
        Cart cart2=new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
        Item item2 = new Item(new Product("Sony Wireless headphone"), 1);
        cart1.add(item1);
        cart2.add(item2);

        System.out.println(cart1.equals(cart2));
    }
}