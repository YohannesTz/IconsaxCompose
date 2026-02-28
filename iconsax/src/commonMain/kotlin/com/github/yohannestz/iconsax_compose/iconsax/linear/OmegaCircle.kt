package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OmegaCircle: ImageVector
    get() {
        val current = _omegaCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.OmegaCircle",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 16.5f)
                horizontalLineToRelative(dx = -3.1f)
                lineToRelative(dx = 1.62f, dy = -1.79f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.24f, dy1 = -3.18f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = -0.5f, dy2 = -2.35f, dx3 = -1.39f, dy3 = -3.2f)
                arcToRelative(a = 4.91f, b = 4.91f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.74f, dy1 = 0.0f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.39f, dy1 = 3.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.17f, dx2 = 0.44f, dy2 = 2.3f, dx3 = 1.24f, dy3 = 3.18f)
                lineToRelative(dx = 1.62f, dy = 1.79f)
                horizontalLineTo(x = 7.0f)
            }
        }.build().also { _omegaCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _omegaCircle: ImageVector? = null
