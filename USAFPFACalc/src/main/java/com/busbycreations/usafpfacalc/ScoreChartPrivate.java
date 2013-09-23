package com.busbycreations.usafpfacalc;

/**
 * Created by mobusby on 9/19/13.
 */
public class ScoreChartPrivate {

    // pushups and situps tables
    private static final double MALE_TWENTY[][] = { // index is number performed (from 0 to 67), pushups score, situps score
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.3, 0}, {5.5, 0}, {5.8, 0}, {6, 0}, {6.3, 0}, {6.5, 0},
            {6.8, 0}, {7, 0}, {7.2, 6}, {7.3, 6.3}, {7.5, 6.5}, {7.7, 7}, {7.8, 7.5}, {8, 8}, {8.1, 8.3}, {8.3, 8.5},
            {8.4, 8.7}, {8.5, 8.8}, {8.6, 9}, {8.7, 9.2}, {8.8, 9.4}, {8.8, 9.5}, {8.9, 9.5}, {9, 9.5}, {9.1, 10}, {9.2, 10},
            {9.3, 10}, {9.4, 10}, {9.5, 10}, {9.5, 10}, {9.5, 10}, {9.5, 10}, {9.5, 10}, {10, 10}};
    private static final double MALE_THIRTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.3, 0}, {5.5, 0},
            {6, 0}, {6.5, 0}, {6.7, 0}, {6.8, 0}, {7, 0}, {7.3, 0}, {7.5, 0}, {7.7, 0}, {7.8, 0}, {8, 6},
            {8.3, 6.5}, {8.5, 7}, {8.6, 7.5}, {8.7, 8}, {8.8, 8.3}, {8.9, 8.5}, {9, 8.7}, {9.1, 8.8}, {9.2, 9}, {9.2, 9.2},
            {9.3, 9.4}, {9.4, 9.5}, {9.5, 9.5}, {9.5, 9.5}, {9.5, 10}, {9.5, 10}, {9.5, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double MALE_FOURTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {5, 0}, {5.5, 0}, {5.8, 0}, {6, 0}, {6.5, 0}, {7, 0}, {7.2, 0}, {7.3, 0}, {7.5, 0},
            {8, 0}, {8.1, 0}, {8.3, 0}, {8.4, 0}, {8.5, 6}, {8.8, 6.5}, {9, 7}, {9.1, 7.5}, {9.2, 7.8}, {9.4, 8},
            {9.5, 8.5}, {9.5, 8.7}, {9.5, 8.8}, {9.5, 9}, {10, 9.1}, {10, 9.2}, {10, 9.4}, {10, 9.5}, {10, 9.5}, {10, 9.5},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double MALE_FIFTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.3, 0}, {5.5, 0}, {5.8, 0}, {6, 0},
            {6.5, 0}, {7, 0}, {7.2, 0}, {7.3, 0}, {7.5, 0}, {8, 0}, {8.2, 0}, {8.3, 0}, {8.5, 6}, {8.8, 6.3},
            {9, 6.5}, {9.1, 7}, {9.1, 7.3}, {9.2, 7.5}, {9.2, 7.8}, {9.3, 8}, {9.3, 8.5}, {9.4, 8.7}, {9.4, 8.8}, {9.5, 9},
            {9.5, 9.1}, {9.5, 9.2}, {9.5, 9.4}, {9.5, 9.5}, {10, 9.5}, {10, 9.5}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double MALE_SIXTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.3, 0}, {5.5, 0}, {5.8, 0}, {6, 0}, {6.3, 0},
            {6.5, 0}, {7, 0}, {7.5, 6}, {8, 6.3}, {8.5, 6.5}, {8.8, 6.8}, {9, 7}, {9.3, 7.3}, {9.5, 7.5}, {9.5, 7.8},
            {10, 8}, {10, 8.5}, {10, 8.6}, {10, 8.8}, {10, 8.9}, {10, 9}, {10, 9.1}, {10, 9.2}, {10, 9.4}, {10, 9.5},
            {10, 9.5}, {10, 9.5}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double FEMALE_TWENTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.5, 0},
            {5.8, 0}, {6, 0}, {6.3, 0}, {6.5, 0}, {7, 0}, {7.2, 0}, {7.3, 0}, {7.5, 0}, {8, 0}, {8.1, 0},
            {8.2, 0}, {8.3, 0}, {8.4, 0}, {8.5, 0}, {8.6, 0}, {8.8, 0}, {8.9, 0}, {9, 0}, {9.1, 6}, {9.2, 6.5},
            {9.3, 6.8}, {9.4, 7}, {9.5, 7.5}, {9.5, 7.8}, {9.5, 8}, {9.5, 8.5}, {9.5, 8.6}, {10, 8.8}, {10, 8.9}, {10, 9},
            {10, 9.4}, {10, 9.5}, {10, 9.5}, {10, 9.5}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double FEMALE_THIRTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {6, 0}, {6.5, 0}, {6.8, 0}, {7, 0}, {7.5, 0},
            {7.6, 0}, {7.8, 0}, {7.9, 0}, {8, 0}, {8.2, 0}, {8.3, 0}, {8.5, 0}, {8.6, 0}, {8.6, 0}, {8.7, 6},
            {8.8, 6.5}, {8.9, 6.8}, {8.9, 7}, {9, 7.5}, {9.1, 7.8}, {9.1, 8}, {9.2, 8.2}, {9.3, 8.3}, {9.3, 8.5}, {9.4, 8.8},
            {9.5, 9}, {9.5, 9.4}, {9.5, 9.5}, {9.5, 9.5}, {9.5, 9.5}, {9.5, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double FEMALE_FOURTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {5, 0}, {5.5, 0}, {6, 0}, {6.5, 0}, {7, 0}, {7.5, 0}, {7.8, 0}, {8, 0}, {8.1, 0},
            {8.2, 0}, {8.3, 0}, {8.4, 0}, {8.5, 0}, {8.6, 6}, {8.6, 6.4}, {8.7, 6.8}, {8.8, 7}, {8.9, 7.5}, {9, 8},
            {9.1, 8.2}, {9.2, 8.3}, {9.4, 8.5}, {9.5, 8.8}, {9.5, 9}, {9.5, 9.1}, {9.5, 9.2}, {9.5, 9.4}, {10, 9.5}, {10, 9.5},
            {10, 9.5}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double FEMALE_FIFTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0},
            {5.5, 0}, {6, 0}, {6.5, 0}, {7, 0}, {7.5, 0}, {8, 0}, {8.1, 0}, {8.2, 0}, {8.3, 0}, {8.4, 0},
            {8.5, 6}, {8.6, 6.5}, {8.6, 7}, {8.7, 7.5}, {8.8, 8}, {9, 8.5}, {9.1, 8.6}, {9.2, 8.8}, {9.3, 8.9}, {9.4, 9},
            {9.5, 9.5}, {9.5, 9.5}, {9.5, 10}, {9.5, 10}, {9.5, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
    private static final double FEMALE_SIXTY[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {5, 0}, {5.3, 0}, {5.7, 0},
            {6, 0}, {6.5, 6}, {7, 6.5}, {7.5, 7}, {8, 7.3}, {8.5, 7.5}, {8.8, 7.8}, {9, 8}, {9.4, 8.2}, {9.5, 8.3},
            {9.5, 8.4}, {10, 8.5}, {10, 8.6}, {10, 8.7}, {10, 8.8}, {10, 8.9}, {10, 9}, {10, 9.4}, {10, 9.5}, {10, 9.5},
            {10, 9.5}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10},
            {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};

    // run time and score tables
    protected static final double RUN_MALE[][] = { // seconds to beat, 20yo score, 30yo, 40yo, 50yo, 60yo
            {60,60,60,60,60,553}, {59.7,60,60,60,60,575}, {59.3,59.3,60,60,60,586}, {58.9,59.3,59.8,60,60,599},
            {58.5,58.6,59.8,60,60,611}, {57.9,57.9,59.5,60,60,624}, {57.3,57.3,59.1,60,60,638}, {56.6,56.6,58.7,59.7,60,652},
            {55.7,55.7,58.3,59.7,60,667}, {54.8,54.8,57.7,59.4,60,683}, {53.7,53.7,57.1,59,59.7,699}, {52.4,52.4,56.3,58.5,59.7,717},
            {50.9,50.9,55.4,58,59.4,735}, {49.2,49.2,54.3,57.3,59,754}, {47.2,47.2,53.1,56.5,58.5,774}, {44.9,44.9,51.5,55.6,58,795},
            {42.3,42.3,49.8,54.5,57.3,817}, {0,39.3,47.7,53.3,56.6,841}, {0,0,45.2,51.8,55.6,866}, {0,0,42.3,50,64.3,893},
            {0,0,0,47.9,53.3,921}, {0,0,0,45.4,51.8,951}, {0,0,0,42.4,50,983}, {0,0,0,0,47.9,1018},
            {0,0,0,0,45.4,1055}, {0,0,0,0,42.4,1095}, {0,0,0,0,0,1137}, {0,0,0,0,0,1184},
            {0,0,0,0,0,1234}, {0,0,0,0,0,1289}, {0,0,0,0,0,1349}, {0,0,0,0,0,1415},
            {0,0,0,0,0,1487}, {0,0,0,0,0,1567}};
    protected static final double RUN_FEMALE[][] = {
            {60,60,60,60,60,553}, {60,60,60,60,60,575}, {60,60,60,60,60,586}, {60,60,60,60,60,599},
            {60,60,60,60,60,611}, {60,60,60,60,60,624}, {59.9,60,60,60,60,638}, {59.9,60,60,60,60,652},
            {59.5,59.5,60,60,60,667}, {59.2,59.5,60,60,60,683}, {58.9,59,59.9,60,60,699}, {58.6,58.6,59.9,60,60,717},
            {58.1,58.1,59.8,60,60,735}, {57.6,57.6,59.6,60,60,754}, {57,57,59.4,60,60,774}, {56.2,56.2,59.1,59.8,60,795},
            {55.3,55.3,58.7,59.8,60,817}, {54.2,54.2,58.2,59.6,60,841}, {52.8,52.8,57.7,59.3,59.8,866}, {51.2,51.2,56.9,58.9,59.8,893},
            {49.3,49.3,56,58.4,59.5,921}, {46.9,46.9,54.8,57.7,59.1,951}, {44.1,44.1,53.3,56.8,58.6,983}, {0,40.8,51.4,55.6,57.9,1018},
            {0,0,49,54,57,1055}, {0,0,45.9,51.9,55.8,1095}, {0,0,0,49.2,54.2,1137}, {0,0,0,45.5,52.1,1184},
            {0,0,0,0,49.3,1234}, {0,0,0,0,45.6,1289}, {0,0,0,0,40.8,1349}, {0,0,0,0,0,1415},
            {0,0,0,0,0,1487}, {0,0,0,0,0,1567}};

    protected static final double WAISTS[][] = { // male score, female score, waist measurement (29 - 43.5)
            {20,20,29}, {20,20,29.5}, {20,20,30}, {20,20,30.5}, {20,20,31},
            {20,20,31.5}, {20,17.6,32}, {20,17.1,32.5}, {20,16.5,33}, {20,15.9,33.5},
            {20,15.2,34}, {20,14.5,34.5}, {20,13.7,35}, {17.6,12.8,35.5}, {17,0,36},
            {16.4,0,36.5}, {15.8,0,37}, {15.1,0,37.5}, {14.4,0,38}, {13.5,0,38.5},
            {12.6,0,39}, {0,0,39.5}, {0,0,40}, {0,0,40.5}, {0,0,41},
            {0,0,41.5}, {0,0,42}, {0,0,42.5}, {0,0,43}, {0,0,43.5}};

    // combined tables accessible to child
    protected static final double PS_TWENTY[][][] = {MALE_TWENTY, FEMALE_TWENTY};
    protected static final double PS_THIRTY[][][] = {MALE_THIRTY, FEMALE_THIRTY};
    protected static final double PS_FOURTY[][][] = {MALE_FOURTY, FEMALE_FOURTY};
    protected static final double PS_FIFTY[][][] =  {MALE_FIFTY, FEMALE_FIFTY};
    protected static final double PS_SIXTY[][][] =  {MALE_SIXTY, FEMALE_SIXTY};

    // altitudes above these minimums earn an altitude correction
    public static final int ALTITUDES[] = {5250, 5500, 6000, 6600};
    public static final int ALTITUDE_CORRECTIONS[][] = { // times below these earn the corresponding correction
            {553,2,6,11,18}, {563,2,6,11,18}, {575,2,6,11,19}, {586,2,7,12,20}, {599,2,7,12,20},
            {611,2,7,12,20}, {624,2,7,12,21}, {638,2,7,12,21}, {652,2,8,13,22}, {667,2,8,13,22},
            {683,2,8,13,22}, {699,3,8,14,23}, {717,3,9,15,24}, {735,3,9,15,25}, {754,3,9,15,26},
            {774,3,9,16,26}, {795,3,9,16,27}, {817,3,10,16,28}, {841,3,10,17,28}, {866,3,10,17,29},
            {893,3,11,18,31}, {921,3,11,18,31}, {951,4,11,19,32}, {983,4,12,20,34}, {1018,5,13,21,36},
            {1055,5,13,22,37}, {1095,5,14,23,38}, {1137,5,14,24,40}, {1184,5,15,25,42}, {1234,5,15,26,43},
            {1289,6,17,28,46}, {1349,6,18,29,49}, {1415,6,18,31,51}, {1487,6,19,32,54}, {1567,7,20,34,57},
            {9999,8,22,37,62}};
}