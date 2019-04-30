/**
 * 
 */
package fr.diginamic.tp11.ia;

import org.neuroph.core.data.DataSet;
import org.neuroph.nnet.MultiLayerPerceptron;

/**
 * @author Jean-Baptiste
 *
 */
public class TestPerceptron {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// création du perceptron avec 2 entrées, 2 neuronnes cachés et 1 sortie
		MultiLayerPerceptron perceptron = new MultiLayerPerceptron(2, 2, 1);

		// étape 1 : l'apprentissage
		DataSet trainingSet = new DataSet(2, 1);

		trainingSet.addRow(new double[] { 1, 0 }, new double[] { 1 });
		trainingSet.addRow(new double[] { 0, 1 }, new double[] { 1 });
		trainingSet.addRow(new double[] { 0, 0 }, new double[] { 0 });
		trainingSet.addRow(new double[] { 1, 1 }, new double[] { 1 });

		for (int i = 0; i < 50; i++) {
			perceptron.learn(trainingSet);
		}
		perceptron.learn(trainingSet);

		// étape 2 : réalisation des tests
		perceptron.setInput(1, 0);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(0, 1);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(0, 0);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);

		perceptron.setInput(1, 1);
		perceptron.calculate();
		System.out.println(perceptron.getOutput()[0]);
	}

}
