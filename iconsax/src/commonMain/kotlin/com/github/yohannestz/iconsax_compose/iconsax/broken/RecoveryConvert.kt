package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 5.53f, y = 15.98f)
                curveToRelative(dx1 = 0.17f, dy1 = 1.79f, dx2 = 1.11f, dy2 = 2.52f, dx3 = 3.16f, dy3 = 2.52f)
                horizontalLineToRelative(dx = 2.73f)
                curveToRelative(dx1 = 2.28f, dy1 = 0.0f, dx2 = 3.19f, dy2 = -0.91f, dx3 = 3.19f, dy3 = -3.2f)
                verticalLineToRelative(dy = -2.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.27f, dx2 = -0.91f, dy2 = -3.18f, dx3 = -3.19f, dy3 = -3.18f)
                horizontalLineTo(x = 8.69f)
                curveToRelative(dx1 = -2.07f, dy1 = 0.0f, dx2 = -3.01f, dy2 = 0.75f, dx3 = -3.16f, dy3 = 2.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.5f, y = 8.68f)
                verticalLineToRelative(dy = 2.73f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.91f, dy2 = 3.19f, dx3 = -3.19f, dy3 = 3.19f)
                horizontalLineTo(x = 14.6f)
                verticalLineToRelative(dy = -2.02f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.27f, dx2 = -0.91f, dy2 = -3.18f, dx3 = -3.19f, dy3 = -3.18f)
                horizontalLineTo(x = 9.4f)
                verticalLineTo(y = 8.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.28f, dx2 = 0.91f, dy2 = -3.18f, dx3 = 3.19f, dy3 = -3.18f)
                horizontalLineToRelative(dx = 2.73f)
                curveToRelative(dx1 = 2.27f, dy1 = 0.0f, dx2 = 3.18f, dy2 = 0.91f, dx3 = 3.18f, dy3 = 3.18f)
                moveTo(x = 22.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 2.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 7.95f, y = 3.75f)
            }
        }.build().also { _recoveryConvert = it }
    }

@Suppress("ObjectPropertyName")
private var _recoveryConvert: ImageVector? = null
