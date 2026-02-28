package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampCharge: ImageVector
    get() {
        val current = _lampCharge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampCharge",
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
                moveTo(x = 19.07f, y = 6.27f)
                curveToRelative(dx1 = 2.09f, dy1 = 4.2f, dx2 = -0.11f, dy2 = 8.66f, dx3 = -3.34f, dy3 = 10.61f)
                verticalLineToRelative(dy = 1.16f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.29f, dx2 = 0.11f, dy2 = 0.96f, dx3 = -0.96f, dy3 = 0.96f)
                horizontalLineTo(x = 9.26f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -0.96f, dy2 = -0.43f, dx3 = -0.96f, dy3 = -0.96f)
                verticalLineToRelative(dy = -1.16f)
                curveTo(x1 = 6.0f, y1 = 15.49f, x2 = 4.11f, y2 = 12.78f, x3 = 4.11f, y3 = 9.9f)
                arcTo(horizontalEllipseRadius = 7.92f, verticalEllipseRadius = 7.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.94f, y1 = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 7.89f)
                lineToRelative(dx = -1.07f, dy = 1.86f)
                curveToRelative(dx1 = -0.24f, dy1 = 0.41f, dx2 = -0.04f, dy2 = 0.75f, dx3 = 0.43f, dy3 = 0.75f)
                horizontalLineToRelative(dx = 1.27f)
                curveToRelative(dx1 = 0.48f, dy1 = 0.0f, dx2 = 0.67f, dy2 = 0.34f, dx3 = 0.43f, dy3 = 0.75f)
                lineTo(x = 12.0f, y = 13.11f)
                moveTo(x = 8.5f, y = 22.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = 0.0f)
            }
        }.build().also { _lampCharge = it }
    }

@Suppress("ObjectPropertyName")
private var _lampCharge: ImageVector? = null
