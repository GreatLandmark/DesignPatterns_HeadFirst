package glm.design_patterns.head_first.ch12_compound_dj;

import java.util.ArrayList;

import javax.sound.midi.Sequencer;
//weiwan未完成。
public class BeatModel implements BeatModelInterface {
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;

    @Override
    public void initialize() {
        // setUpMidi();
        // buildTrackAndStart();
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setBPM(int bpm) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getBPM() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(BeatObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerObserver(BPMObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(BPMObserver o) {
        // TODO Auto-generated method stub

    }

}