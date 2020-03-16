package chapter6;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private CostData cost;

    public RetailItem(
            String description,
            int unitsOnHand,
            double wholeSale,
            double retail) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.cost = new CostData(
                wholeSale,
                retail);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public CostData getCost() {
        return cost;
    }

    public void setCost(CostData cost) {
        this.cost = cost;
    }

    public void setCostWholeSale(double wholeSale) {
        this.cost.setRetail(wholeSale);
    }

    public double getCostWholeSale() {
        return cost.getWholeSale();
    }

    public void setCostRetail(double retail) {
        this.cost.setRetail(retail);
    }

    public double getCostRetail() {
        return cost.getRetail();
    }

    @Override
    public String toString() {
        return "RetailItem{" +
                "description='" + description + '\'' +
                ", unitsOnHand=" + unitsOnHand +
                ", cost=" + cost +
                '}';
    }

    // inner class
    private class CostData {
        public double wholeSale;
        public double retail;

        public CostData(double wholeSale, double retail) {
            this.wholeSale = wholeSale;
            this.retail = retail;
        }

        public double getWholeSale() {
            return wholeSale;
        }

        public void setWholeSale(double wholeSale) {
            this.wholeSale = wholeSale;
        }

        public double getRetail() {
            return retail;
        }

        public void setRetail(double retail) {
            this.retail = retail;
        }

        @Override
        public String toString() {
            return "CostData{" +
                    "wholeSale=" + wholeSale +
                    ", retail=" + retail +
                    '}';
        }
    }
}
