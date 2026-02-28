package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OmegaSquare: ImageVector
    get() {
        val current = _omegaSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.OmegaSquare",
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
                moveTo(x = 22.0f, y = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 16.75f)
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
        }.build().also { _omegaSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _omegaSquare: ImageVector? = null
