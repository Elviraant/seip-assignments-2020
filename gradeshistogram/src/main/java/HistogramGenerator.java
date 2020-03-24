import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/***
 * This is a class to generate histograms.
 * @author Elviraant
 * @since March 2020
 */

public class HistogramGenerator {	
	
	/**
	 * Reads and stores the values from a file.
	 * Returns the values in an array.
	 * @param fileName 
	 * @return a signle dimension integer array
	 */
	public Integer[] readFile(String fileName) {
		try {
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
					
			List<Integer> values = new ArrayList<Integer>();
			
			while (reader.hasNextInt()) {
				int data = reader.nextInt();
				values.add(data);		
			}
			
			Integer[] valuesInArray = new Integer[values.size()];

			reader.close();
			return values.toArray(valuesInArray);
			
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		
		return null;				
	}
	
	/**
	 * Takes an array of grades in a scale of 0-10.
	 * Then, calculates and returns the frequencies stored in an array.
	 * @param grades - grades stored in an single dimension array
	 * @return a single dimension integer array
	 */
	public int[] calculateGradesFrequencies(Integer[] grades) {
		int[] frequencies = new int[11];
		
		for (int i=0; i < frequencies.length; i++) {
			frequencies[i] = 0;
		}
		
		for (int i=0; i < grades.length; i++) {
			frequencies[grades[i]]++;			
		}
		
		return frequencies;
	}
	
	/***
	 * Receives a single dimension Integer array. From this array the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then
	 * presented in the screen.
	 * 
	 * @param values single dimension integer array
	 */
	public void generateHistogram(int[] values) {
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		XYSeries data = new XYSeries("random values");
		
		for (int i = 0; i < values.length; i++) {
			data.add(i, values[i]);
		}
		
		dataset.addSeries(data);
		
		boolean legend = false; 
		boolean tooltips = false; 
		boolean urls = false; 

		JFreeChart chart = ChartFactory.createXYLineChart("Grades Histogram", "Grades", "Frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();

		frame.setVisible(true);
	
	}
	
	/***
	 * Gets a grades' file as an argument.
	 * Then, generates an histogram using the grades' frequencies. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		HistogramGenerator histogramGenerator = new HistogramGenerator();
		
		Integer[] grades = histogramGenerator.readFile(args[0]);	
		int[] frequencies = histogramGenerator.calculateGradesFrequencies(grades);
		histogramGenerator.generateHistogram(frequencies);
		
	}
		
		
}
