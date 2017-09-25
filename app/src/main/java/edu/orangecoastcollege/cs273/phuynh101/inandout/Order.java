package edu.orangecoastcollege.cs273.phuynh101.inandout;

/**
 * Created by HuynhHuu on 25-Sep-17.
 */

public class Order {
    private int mCheeseBurgers;
    private int mDoubleDoubles;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mShakes;
    private int mSmallDrinks;

    /**
     * Price of a cheeseburger
     */
    public static final double PRICE_CHEESEBURGER = 2.15;
    /**
     * price of a double double
     */
    public static final double PRICE_DOUBLE_DOUBLE = 3.60;
    /**
     * price of french fries
     */
    public static final double PRICE_FRENCH_FRIES = 1.65;
    /**
     * prce of a large drink
     */
    public static final double PRICE_LARGE_DRINK = 1.75;
    /**
     * price of a medium drink
     */
    public static final double PRICE_MEDIUM_DRINK = 1.55;
    /**
     * price of a shake
     */
    public static final double PRICE_SHAKE = 2.20;
    /**
     * price of a small drink
     */
    public static final double PRICE_SMALL_DRINK = 1.45;
    /**
     * tax rate
     */
    public static final double TAX_RATE = 0.08;

    /**
     * default constructor
     */
    public Order() {
        mCheeseBurgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mShakes = 0;
        mSmallDrinks = 0;
    }

    /**
     * get the number of cheeseburgers
     *
     * @return the number of cheeseburgers
     */
    public int getCheeseBurgers() {
        return mCheeseBurgers;
    }

    /**
     * set the number of cheeseburgers
     *
     * @param cheeseBurgers
     */
    public void setCheeseBurgers(int cheeseBurgers) {
        mCheeseBurgers = cheeseBurgers;
    }

    /**
     * get the number of double-double's
     *
     * @return
     */
    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    /**
     * set the number of double-double's
     *
     * @param doubleDoubles the number of double-double's
     */
    public void setDoubleDoubles(int doubleDoubles) {
        mDoubleDoubles = doubleDoubles;
    }

    /**
     * get the number of french fries orders
     *
     * @return the number of french fries orders
     */
    public int getFrenchFries() {
        return mFrenchFries;
    }

    /**
     * set the number of french fries orders
     *
     * @param frenchFries the number of french fries orders
     */
    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    /**
     * get the number of large drinks
     *
     * @return the number of large drinks
     */
    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    /**
     * set the number of large drinks
     *
     * @param largeDrinks the number of large drinks
     */
    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    /**
     * get the number of medium drinks
     *
     * @return the number of medium drinks
     */
    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    /**
     * set the number of medium drinks
     *
     * @param mediumDrinks the number of medium drinks
     */
    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    /**
     * get the number of shakes
     *
     * @return the number of shakes
     */
    public int getShakes() {
        return mShakes;
    }

    /**
     * set the number of shakes
     *
     * @param shakes the number of shakes
     */
    public void setShakes(int shakes) {
        mShakes = shakes;
    }

    /**
     * get the number of small drinks
     *
     * @return the number of small drinks
     */
    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * set the number of small drinks
     *
     * @param smallDrinks the number of small drinks
     */
    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    /**
     * calculate the subtotal
     *
     * @return the subtotal
     */
    public double calculateSubtotal() {
        return mCheeseBurgers * PRICE_CHEESEBURGER + mDoubleDoubles * PRICE_DOUBLE_DOUBLE
                + mFrenchFries * PRICE_FRENCH_FRIES + mLargeDrinks * PRICE_LARGE_DRINK
                + mSmallDrinks * PRICE_SMALL_DRINK + mMediumDrinks * PRICE_MEDIUM_DRINK
                + mShakes * PRICE_SHAKE;
    }

    /**
     * calculate the tax
     *
     * @return the tax
     */
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * calculate the total
     *
     * @return the total
     */
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }

    /**
     * calculate the number of items ordered
     *
     * @return the number of items ordered
     */
    public int getNumberItemsOrdered() {
        return mCheeseBurgers + mDoubleDoubles + mFrenchFries
                + mLargeDrinks + mSmallDrinks + mMediumDrinks + mShakes;
    }
}
