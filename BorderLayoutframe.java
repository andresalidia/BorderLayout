/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package borderlayoutframe;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing. JFrame;
import javax.swing. JButton;
/**
 *
 * @author Aluno
 */
public class BorderLayoutframe extends JFrame implements ActionListener {
private final JButton[] buttons; // array de botoes para ocultar partes
private static final String[] names = { "Hide North", "Hide South",
"Hide East", "Hide West", "Hide Center" };
private final BorderLayout layout; // objeto borderlayout
// configura GUI e tratamento de evento
public BorderLayoutframe(){
    super( "BorderLayout Demo" );
    layout = new BorderLayout( 5, 5 ); // espaços de 5 pixels
    setLayout( layout ); // configura o layout de frame
    buttons = new JButton[ names. length ]; // configura o tamanho do array
    // cria JButtons e registra listeners para eles
    for ( int count = 0; count < names. length; count++ ){
        buttons[ count ] = new JButton( names[ count ] );
        buttons[ count ].addActionListener( this );
    }// for final
    add( buttons[ 0 ], BorderLayout.NORTH ); // adiciona botão para o norte
    add( buttons[ 1 ], BorderLayout.SOUTH ); // adiciona botão para o sul
    add( buttons[ 2 ], BorderLayout.EAST ); // adiciona botão para o leste
    add( buttons[ 3 ], BorderLayout.WEST ); // adiciona botão para o oeste
    add( buttons[ 4 ], BorderLayout.CENTER ); // adiciona botão para o centro
} // fim do construtor BorderLayoutFrane
// trata os eventos de botão
@Override
public void actionPerformed( ActionEvent event ){
    // verifica a origem de evento e o painel de conteudo de layout correspondentemente
    for ( JButton button : buttons ){
        if ( event.getSource() == button )
            button.setVisible( false ); // oculta o botão clicado
        else
            button.setVisible( true ); // mostra outros botões
} // for final
    layout. layoutContainer( getContentPane() ); // faz o layout do painel de conteúdo
} // fim do metodo actionPerformed
} // fim da classe BorderLayoutFrame

