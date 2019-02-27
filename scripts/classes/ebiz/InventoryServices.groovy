package ebiz

/**
 * Collection of Inventory services
 */
public class InventoryServices {

	/** max count property **/
	private int maxLevelCount
    public void setMaxLevelCount(int value) { maxLevelCount = value }
    public int getMaxLevelCount() { return maxLevelCount }
    
    /**
     * Given a productId, return an inventory level
     * Sorta :)
     */
	int getInventoryByProductId(String id) {
		return Math.abs(new Random().nextInt() % this.maxLevelCount) + 1
    }
}