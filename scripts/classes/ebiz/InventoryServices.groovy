package ebiz

/**
 * Collection of Inventory services
 */
public class InventoryServices {

	private int maxLevelCount
    public int setMaxLevelCount(int value) { maxLevelCount = value }
    public void getMaxLevelCount() { return maxLevelCount }
    
	int getInventoryForProductId(id) {
		return Math.abs(new Random().nextInt() % this.maxLevelCount) + 1
    }
}