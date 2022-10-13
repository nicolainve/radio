class Radio {
  private boolean isOn;
  private int volume;
  private int minVolume;
  private int maxVolume;
  private float channel;
  private float minChannel;
  private float maxChannel;

  public Radio() {
    isOn = false;
    volume = 50;
    minVolume = 0;
    maxVolume = 100;
    minChannel = 87.5f;
    channel = minChannel;
    maxChannel = 108f;
  }

  public Radio(Radio r) {
    this.isOn = r.isOn;
    this.volume = r.volume;
    this.minVolume = r.minVolume;
    this.maxVolume = r.maxVolume;
    this.channel = r.channel;
    this.minChannel = r.minChannel;
    this.maxChannel = r.maxChannel;
  }

  public Radio copyMoto() {
    return new Radio(this);
  }

  public String getStatus() {
    return isOn ? "La radio è accesa" : "La radio è spenta";
  }

  public int getVolume() {
    return volume;
  }

  public float getChannel() {
    return channel;
  }

  public void powerOn() {
    isOn = true;
  }

  public void powerOff() {
    isOn = false;
  }

  public void setVolume(int volume) {
    if (volume > minVolume && volume < maxVolume) {
      this.volume = volume;
    }
  }

  public void changeVolume(int volume) {
    int delta = this.volume + volume;
    if (delta > minVolume && delta < maxVolume) {
      this.volume = delta;
    }
  }

  public void setChannel(float channel) {
    if (channel > minChannel && channel < maxChannel) {
      this.channel = channel;
    }
  }

  public void changeChannel(float channel) {
    float delta = this.channel + channel;
    if (delta > minChannel && delta < maxChannel) {
      this.channel = delta;
    }
  }

  public String toString() {
    return "Stato: " + (isOn ? "accesa" : "spenta") + "\nVolume: " + volume + "%" + "\nCanale: "
        + channel + "MHz";
  }

  public boolean equals(Radio r) {
    return this.volume == r.volume && this.channel == r.channel;
  }
}
