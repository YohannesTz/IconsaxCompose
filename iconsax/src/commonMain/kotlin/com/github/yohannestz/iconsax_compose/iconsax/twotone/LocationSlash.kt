package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationSlash: ImageVector
    get() {
        val current = _locationSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationSlash",
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
                moveTo(x = 10.42f, y = 13.0f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.54f, dy1 = -2.69f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.81f, dy1 = -1.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.99f, y = 17.81f)
                curveToRelative(dx1 = -1.84f, dy1 = -2.51f, dx2 = -3.18f, dy2 = -5.72f, dx3 = -2.36f, dy3 = -9.32f)
                curveToRelative(dx1 = 1.65f, dy1 = -7.26f, dx2 = 10.94f, dy2 = -8.43f, dx3 = 15.05f, dy3 = -3.51f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.38f, y = 8.5f)
                curveToRelative(dx1 = 1.15f, dy1 = 5.08f, dx2 = -2.01f, dy2 = 9.38f, dx3 = -4.78f, dy3 = 12.04f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.21f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _locationSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _locationSlash: ImageVector? = null
