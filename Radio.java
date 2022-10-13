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

  public String getVolume() {
    return "Il volume è al " + volume + "%";
  }

  public String getChannel() {
    return "Il canale è " + channel + "MHz";
  }

  public void powerOn() {
    isOn = true;
  }

  public void powerOff() {
    isOn = false;
  }

  public String setVolume(int volume) {
    if (volume > minVolume && volume < maxVolume) {
      this.volume = volume;
      return "Il volume è al " + this.volume;
    } else {
      return "Imposta un volume tra 0 e 100%";
    }
  }

  public String changeVolume(int volume) {
    int delta = this.volume + volume;
    if (delta > minVolume && delta < maxVolume) {
      this.volume = delta;
      return "Il volume è al " + this.volume;
    } else {
      return "Imposta un volume tra 0 e 100%";
    }
  }

  public String setChannel(float channel) {
    if (channel > minChannel && channel < maxChannel) {
      this.channel = channel;
      return "Il canale è " + this.channel;
    } else {
      return "Seleziona un canale tra 87.5MHz e 108MHz";
    }
  }

  public String changeChannel(float channel) {
    float delta = this.channel + channel;
    if (delta > minChannel && delta < maxChannel) {
      this.channel = delta;
      return "Il canale è " + this.channel;
    } else {
      return "Seleziona un canale tra 87.5MHz e 108MHz";
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
