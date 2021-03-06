package com.mahjongscoring.DBClasses;

import com.mahjongscoring.AppClasses.Enums;

import java.util.Date;

public class DBPartida {

	//CAMPOS
	private int Id;
	private Enums.TiposJuego TipoJuego;
	/*private int PuntosIniciales;*/
	private int PuntosMinimosMcr;
	/*private int BoteFinalRichii;*/
	private String NombreJ1;
	private String NombreJ2;
	private String NombreJ3;
	private String NombreJ4;
	private int PuntosJ1;
	private int PuntosJ2;
	private int PuntosJ3;
	private int PuntosJ4;
	private boolean IsTimerOn;
	private boolean IsSonidoFinalOn;
	private boolean IsSonidoUltimos15On;
	private long DuracionTimer;
    private long MilisTranscurridosORestantes;
	private int NumeroRondas;
	/*private int ContadoresRichii;
	private int BoteRichii;
	private int VecesJefeRichii;*/
	private int PuntosMejorJugada;
	private String NombreJugadorMejorJugada;
	private Date FechaInicio;
	private Date FechaFin;

    //GETTERS
	public int getId() { return Id;	}
	public Enums.TiposJuego getTipoJuego() { return TipoJuego; }
	/*public int getPuntosIniciales() { return PuntosIniciales; }*/
	public int getPuntosMinimosMcr() { return PuntosMinimosMcr; }
	/*public int getBoteFinalRichii() { return BoteFinalRichii; }*/
	public String getNombreJ1() { return NombreJ1; }
	public String getNombreJ2() { return NombreJ2; }
	public String getNombreJ3() { return NombreJ3; }
	public String getNombreJ4() { return NombreJ4; }
	public int getPuntosJ1() { return PuntosJ1; }
	public int getPuntosJ2() { return PuntosJ2; }
	public int getPuntosJ3() { return PuntosJ3; }
	public int getPuntosJ4() { return PuntosJ4; }
	public boolean isTimerOn() { return IsTimerOn; }
	public boolean isSonidoFinalOn() { return IsSonidoFinalOn; }
	public boolean isSonidoUltimos15On() { return IsSonidoUltimos15On; }
	public long getDuracionTimer() { return DuracionTimer; }
    public long getMilisTranscurridosORestantes() { return MilisTranscurridosORestantes; }
	public int getNumeroRondas() { return NumeroRondas; }
	/*public int getContadoresRichii() { return ContadoresRichii; }
	public int getBoteRichii() { return BoteRichii; }
	public int getVecesJefeRichii() { return VecesJefeRichii; }*/
	public String getNombreJugadorMejorJugada() { return NombreJugadorMejorJugada; }
	public int getPuntosMejorJugada() { return PuntosMejorJugada; }
	public Date getFechaInicio() { return FechaInicio; }
	public Date getFechaFin() { return FechaFin; }

	//SETTERS
	public void setId(int id) {	Id = id; }
	public void setTipoJuego(Enums.TiposJuego tipoJuego) { TipoJuego = tipoJuego; }
	/*public void setPuntosIniciales(int puntosIniciales) { PuntosIniciales = puntosIniciales; }*/
	public void setPuntosMinimosMcr(int puntosMinimosMcr) { PuntosMinimosMcr = puntosMinimosMcr; }
	/*public void setBoteFinalRichii(int boteFinalRichii) { BoteFinalRichii = boteFinalRichii; }*/
	public void setNombreJ1(String nombreJ1) { NombreJ1 = nombreJ1;	}
	public void setNombreJ2(String nombreJ2) { NombreJ2 = nombreJ2;	}
	public void setNombreJ3(String nombreJ3) { NombreJ3 = nombreJ3;	}
	public void setNombreJ4(String nombreJ4) { NombreJ4 = nombreJ4;	}
	public void setPuntosJ1(int puntosJ1) { PuntosJ1 = puntosJ1; }
	public void setPuntosJ2(int puntosJ2) { PuntosJ2 = puntosJ2; }
	public void setPuntosJ3(int puntosJ3) { PuntosJ3 = puntosJ3; }
	public void setPuntosJ4(int puntosJ4) { PuntosJ4 = puntosJ4; }
	public void setIsTimerOn(boolean isTimerOn) { IsTimerOn = isTimerOn; }
	public void setIsSonidoFinalOn(boolean isSonidoFinalOn) { IsSonidoFinalOn = isSonidoFinalOn; }
	public void setIsSonidoUltimos15On(boolean isSonidoUltimos15On) { IsSonidoUltimos15On = isSonidoUltimos15On; }
	public void setDuracionTimer(long duracionTimer) { DuracionTimer = duracionTimer; }
    public void setMilisTranscurridosORestantes(long milisTranscurridosORestantes) { this.MilisTranscurridosORestantes = milisTranscurridosORestantes; }
	public void setNumeroRondas(int numeroRondas) { NumeroRondas = numeroRondas; }
	/*public void setContadoresRichii(int contadoresRichii) { ContadoresRichii = contadoresRichii; }
	public void setBoteRichii(int boteRichii) { BoteRichii = boteRichii; }
	public void setVecesJefeRichii(int vecesJefeRichii) { VecesJefeRichii = vecesJefeRichii; }*/
	public void setNombreJugadorMejorJugada(String nombreJugadorMejorJugada) { NombreJugadorMejorJugada = nombreJugadorMejorJugada; }
	public void setPuntosMejorJugada(int puntosMejorJugada) { PuntosMejorJugada = puntosMejorJugada; }
	public void setFechaInicio(Date fechaInicio) { FechaInicio = fechaInicio; }
	public void setFechaFin(Date fechaFin) { FechaFin = fechaFin; }

	//CONSTRUCTORES
	public DBPartida() {}
	public DBPartida(int id, Enums.TiposJuego tipoJuego, /*int puntosIniciales,*/ int puntosMinimosMcr, /*int boteFinalRichii,*/
			String[] nombresJs, int[] puntosJs, boolean isTimerOn, boolean isSonidoFinalOn, 
			boolean isSonidoUltimos15On, long duracionTimer, long milisTranscurridosORestantes, int numeroRondas, /*int contadoresRichii, int boteRichii
			, int vecesJefeRichii,*/ String nombreJugadorMejorJugada,	int puntosMejorJugada, Date fechaInicio, Date fechaFin){
		Id = id;
		TipoJuego = tipoJuego;
		/*PuntosIniciales = puntosIniciales;*/
		PuntosMinimosMcr = puntosMinimosMcr;
		/*BoteFinalRichii = boteFinalRichii;*/
		NombreJ1 = nombresJs[0];
		NombreJ2 = nombresJs[1];
		NombreJ3 = nombresJs[2];
		NombreJ4 = nombresJs[3];
		PuntosJ1 = puntosJs[0];
		PuntosJ2 = puntosJs[1];
		PuntosJ3 = puntosJs[2];
		PuntosJ4 = puntosJs[3];
		IsTimerOn = isTimerOn;
		IsSonidoFinalOn = isSonidoFinalOn;
		IsSonidoUltimos15On = isSonidoUltimos15On;
		DuracionTimer = duracionTimer;
        MilisTranscurridosORestantes = milisTranscurridosORestantes;
		NumeroRondas = numeroRondas;
		/*ContadoresRichii = contadoresRichii;
		BoteRichii = boteRichii;
		VecesJefeRichii = vecesJefeRichii;*/
		NombreJugadorMejorJugada = nombreJugadorMejorJugada;
		PuntosMejorJugada = puntosMejorJugada;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
	}
	public DBPartida(Enums.TiposJuego tipoJuego, /*int puntosIniciales,*/ int puntosMinimosMcr, /*int boteFinalRichii,*/
			String[] nombresJs, int[] puntosJs, boolean isTimerOn, boolean isSonidoFinalOn, 
			boolean isSonidoUltimos15On, long duracionTimer, long milisTranscurridosORestantes, int numeroRondas, /*int contadoresRichii, int boteRichii
			, int vecesJefeRichii,*/ String nombreJugadorMejorJugada, int puntosMejorJugada, Date fechaInicio, Date fechaFin){
		TipoJuego = tipoJuego;
		/*PuntosIniciales = puntosIniciales;*/
		PuntosMinimosMcr = puntosMinimosMcr;
		/*BoteFinalRichii = boteFinalRichii;*/
		NombreJ1 = nombresJs[0];
		NombreJ2 = nombresJs[1];
		NombreJ3 = nombresJs[2];
		NombreJ4 = nombresJs[3];
		PuntosJ1 = puntosJs[0];
		PuntosJ2 = puntosJs[1];
		PuntosJ3 = puntosJs[2];
		PuntosJ4 = puntosJs[3];
		IsTimerOn = isTimerOn;
		IsSonidoFinalOn = isSonidoFinalOn;
		IsSonidoUltimos15On = isSonidoUltimos15On;
		DuracionTimer = duracionTimer;
        MilisTranscurridosORestantes = milisTranscurridosORestantes;
		NumeroRondas = numeroRondas;
		/*ContadoresRichii = contadoresRichii;
		BoteRichii = boteRichii;
		VecesJefeRichii = vecesJefeRichii;*/
		NombreJugadorMejorJugada = nombreJugadorMejorJugada;
		PuntosMejorJugada = puntosMejorJugada;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
	}

	//METODOS
	public String[] getArrayNombres() {
		String[] nombres = { NombreJ1, NombreJ2, NombreJ3, NombreJ4 };
		return nombres;
	}
	public int[] getArrayPuntos() {
		int[] puntos = { PuntosJ1, PuntosJ2, PuntosJ3, PuntosJ4 };
		return puntos;
	}
	public void setPuntos(int puntosJ1, int puntosJ2, int puntosJ3, int puntosJ4) {
		PuntosJ1 = puntosJ1;
		PuntosJ2 = puntosJ2;
		PuntosJ3 = puntosJ3;
		PuntosJ4 = puntosJ4;
	}
}
