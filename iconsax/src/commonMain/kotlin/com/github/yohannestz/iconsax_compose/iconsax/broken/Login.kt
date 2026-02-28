package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Login: ImageVector
    get() {
        val current = _login
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Login",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.68f, y = 14.56f)
                lineTo(x = 14.24f, y = 12.0f)
                lineToRelative(dx = -2.56f, dy = -2.56f)
                moveTo(x = 9.0f, y = 12.0f)
                horizontalLineToRelative(dx = 5.17f)
                moveTo(x = 4.0f, y = 12.0f)
                horizontalLineToRelative(dx = 1.96f)
                moveToRelative(dx = 12.05f, dy = -5.52f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -3.58f, dy2 = 8.0f, dx3 = -8.0f, dy3 = 8.0f)
                moveToRelative(dx = 0.0f, dy = -16.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.97f, dy1 = 0.49f)
            }
        }.build().also { _login = it }
    }

@Suppress("ObjectPropertyName")
private var _login: ImageVector? = null
