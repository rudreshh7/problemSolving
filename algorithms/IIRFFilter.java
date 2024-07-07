
/**
 * N-Order IIR Filter Assumes inputs are normalized to [-1, 1]
 *
 * Based on the difference equation from
 * <a href="https://en.wikipedia.org/wiki/Infinite_impulse_response">Wikipedia link</a>
 */
public class IIRFilter {

    private final int order;
    private final double[] coeffsA;
    private final double[] coeffsB;
    private final double[] historyX;
    private final double[] historyY;

    /**
     * Construct an IIR Filter
     *
     * @param order the filter's order
     * @throws IllegalArgumentException if order is zero or less
     */
    public IIRFilter(int order) throws IllegalArgumentException {
        if (order < 1) {
            throw new IllegalArgumentException("order must be greater than zero");
        }

        this.order = order;
        coeffsA = new double[order + 1];
        coeffsB = new double[order + 1];

        // Sane defaults
        coeffsA[0] = 1.0;
        coeffsB[0] = 1.0;

        historyX = new double[order];
        historyY = new double[order];
    }

    /**
     * Set coefficients
     *
     * @param aCoeffs Denominator coefficients
     * @param bCoeffs Numerator coefficients
     * @throws IllegalArgumentException if {@code aCoeffs} or {@code bCoeffs} is
     * not of size {@code order + 1}, or if {@code aCoeffs[0]} is 0.0
     */
    public void setCoeffs(double[] aCoeffs, double[] bCoeffs) throws IllegalArgumentException {
        if (aCoeffs.length != order + 1) {
            throw new IllegalArgumentException("aCoeffs must be of size " + (order + 1) + ", got " + aCoeffs.length);
        }

        if (aCoeffs[0] == 0.0) {
            throw new IllegalArgumentException("aCoeffs[0] must not be zero");
        }

        if (bCoeffs.length != order + 1) {
            throw new IllegalArgumentException("bCoeffs must be of size " + (order + 1) + ", got " + bCoeffs.length);
        }

        System.arraycopy(aCoeffs, 0, coeffsA, 0, order + 1);
        System.arraycopy(bCoeffs, 0, coeffsB, 0, order + 1);
    }

    /**
     * Process a single sample
     *
     * @param sample the sample to process
     * @return the processed sample
     */
    public double process(double sample) {
        double result = coeffsB[0] * sample;

        for (int i = 1; i <= order; i++) {
            result += coeffsB[i] * historyX[i - 1] - coeffsA[i] * historyY[i - 1];
        }

        result /= coeffsA[0];

        // Feedback
        System.arraycopy(historyX, 0, historyX, 1, order - 1);
        System.arraycopy(historyY, 0, historyY, 1, order - 1);

        historyX[0] = sample;
        historyY[0] = result;

        return result;
    }
}
