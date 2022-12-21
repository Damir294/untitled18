package Product;
import java.util.Objects;
public class Product {
    private final String name;
    private final float price;
    private final int quantity;
    private boolean checked;

    public Product(String name, float price, int quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
    public Product(String name, float price) {
                if (name == null || name.isBlank() || price < 0) {
                    throw new IllegalArgumentException("Заполните карточку товара полностью");
                }
                this.name = name;
                this.price = price;
                this.quantity = quantity;
                this.checked = false;
            }

            public String getName() {
                @@ -26,18 +22,6 @@ public float getPrice() {
                    return price;
                }

                public int getQuantity() {
                    return quantity;
                }

                public void setChecked() {
                    this.checked = true;
                }

                public boolean isChecked() {
                    return checked;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    @@ -53,10 +37,6 @@ public int hashCode() {

                        @Override
                        public String toString() {
                            String checkedString = this.isChecked() ? "Да" : "Нет";
                            return name +
                                    " - цена: " + price +
                                    ", количество: " + quantity +
                                    ", куплен: " + checked;
                            return name + " - цена: " + price;
                        }
                    }