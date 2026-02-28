package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecoveryConvert: ImageVector
    get() {
        val current = _recoveryConvert
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RecoveryConvert",
            defaultWidth = 22.0.dp,
            defaultHeight = 22.0.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.6f, y = 11.58f)
                verticalLineToRelative(dy = 2.73f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.91f, dy2 = 3.19f, dx3 = -3.19f, dy3 = 3.19f)
                horizontalLineTo(x = 7.69f)
                curveToRelative(dx1 = -2.27f, dy1 = 0.0f, dx2 = -3.19f, dy2 = -0.91f, dx3 = -3.19f, dy3 = -3.2f)
                verticalLineToRelative(dy = -2.72f)
                curveTo(x1 = 4.5f, y1 = 9.3f, x2 = 5.41f, y2 = 8.4f, x3 = 7.69f, y3 = 8.4f)
                horizontalLineToRelative(dx = 2.73f)
                curveToRelative(dx1 = 2.27f, dy1 = 0.0f, dx2 = 3.18f, dy2 = 0.9f, dx3 = 3.18f, dy3 = 3.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.5f, y = 7.68f)
                verticalLineToRelative(dy = 2.73f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.91f, dy2 = 3.19f, dx3 = -3.19f, dy3 = 3.19f)
                horizontalLineTo(x = 13.6f)
                verticalLineToRelative(dy = -2.02f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.27f, dx2 = -0.91f, dy2 = -3.18f, dx3 = -3.19f, dy3 = -3.18f)
                horizontalLineTo(x = 8.4f)
                verticalLineTo(y = 7.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.28f, dx2 = 0.91f, dy2 = -3.18f, dx3 = 3.19f, dy3 = -3.18f)
                horizontalLineToRelative(dx = 2.73f)
                curveToRelative(dx1 = 2.27f, dy1 = 0.0f, dx2 = 3.18f, dy2 = 0.91f, dx3 = 3.18f, dy3 = 3.18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 14.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 1.0f, y = 8.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 6.95f, y = 2.75f)
            }
        }.build().also { _recoveryConvert = it }
    }

@Suppress("ObjectPropertyName")
private var _recoveryConvert: ImageVector? = null
