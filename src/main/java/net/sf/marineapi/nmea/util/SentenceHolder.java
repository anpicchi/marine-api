package net.sf.marineapi.nmea.util;

/**
 * Holds a NMEA sentence along with a flag indicating whether it follows
 * military format. This class provides simple accessors to retrieve
 * the stored sentence and its type.
 */
public class SentenceHolder {

    /** Indicates whether the sentence follows military format. */
    private boolean military;

    /** The NMEA sentence being stored. */
    private String sentence;

    /**
     * Creates a new SentenceHolder with the specified sentence type and content.
     *
     * @param military true if the sentence is in military format, false otherwise
     * @param sentence the NMEA sentence to store
     */
    public SentenceHolder(boolean military, String sentence) {
        this.military = military;
        this.sentence = sentence;
    }

    /**
     * Returns whether the stored sentence follows military format.
     *
     * @return true if the sentence is military, false otherwise
     */
    public boolean isMilitary() {
        return this.military;
    }

    /**
     * Returns the stored NMEA sentence.
     *
     * @return the sentence as a String
     */
    public String getSentence() {
        return this.sentence;
    }
}

