package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoginCurve: ImageVector
    get() {
        val current = _loginCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LoginCurve",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.9f, y = 7.56f)
                curveToRelative(dx1 = 0.31f, dy1 = -3.6f, dx2 = 2.16f, dy2 = -5.07f, dx3 = 6.21f, dy3 = -5.07f)
                horizontalLineToRelative(dx = 0.13f)
                curveToRelative(dx1 = 4.47f, dy1 = 0.0f, dx2 = 6.26f, dy2 = 1.79f, dx3 = 6.26f, dy3 = 6.26f)
                verticalLineToRelative(dy = 6.52f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.47f, dx2 = -1.79f, dy2 = 6.26f, dx3 = -6.26f, dy3 = 6.26f)
                horizontalLineToRelative(dx = -0.13f)
                curveToRelative(dx1 = -4.02f, dy1 = 0.0f, dx2 = -5.87f, dy2 = -1.45f, dx3 = -6.2f, dy3 = -4.99f)
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 12.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.65f, y = 8.65f)
                lineTo(x = 16.0f, y = 12.0f)
                lineToRelative(dx = -3.35f, dy = 3.35f)
            }
        }.build().also { _loginCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _loginCurve: ImageVector? = null
