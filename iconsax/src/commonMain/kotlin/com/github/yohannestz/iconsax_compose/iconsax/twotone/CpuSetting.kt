package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CpuSetting: ImageVector
    get() {
        val current = _cpuSetting
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CpuSetting",
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
                moveTo(x = 20.0f, y = 9.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.6f, dy2 = -5.6f, dx3 = -5.6f, dy3 = -5.6f)
                horizontalLineTo(x = 9.6f)
                curveTo(x1 = 5.6f, y1 = 4.0f, x2 = 4.0f, y2 = 5.6f, x3 = 4.0f, y3 = 9.6f)
                verticalLineToRelative(dy = 4.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = 1.6f, dy2 = 5.6f, dx3 = 5.6f, dy3 = 5.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.35f, y = 8.0f)
                curveToRelative(dx1 = -0.55f, dy1 = -0.7f, dx2 = -1.47f, dy2 = -1.0f, dx3 = -2.85f, dy3 = -1.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveTo(x1 = 8.0f, y1 = 7.0f, x2 = 7.0f, y2 = 8.0f, x3 = 7.0f, y3 = 10.5f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.38f, dx2 = 0.3f, dy2 = 2.3f, dx3 = 0.99f, dy3 = 2.85f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.01f, y = 4.0f)
                verticalLineTo(y = 2.0f)
                moveTo(x = 12.0f, y = 4.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 4.0f, dy = 2.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 4.0f, dy = 6.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveTo(x = 8.01f, y = 20.0f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 2.0f, y = 8.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = -2.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.71f, y = 18.59f)
                arcToRelative(a = 1.59f, b = 1.59f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.18f)
                arcToRelative(a = 1.59f, b = 1.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.41f, y = 17.46f)
                verticalLineToRelative(dy = -0.93f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                curveToRelative(dx1 = 0.96f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.68f, dx3 = 0.87f, dy3 = -1.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -1.38f)
                lineToRelative(dx = 0.91f, dy = -0.53f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = 0.32f)
                lineToRelative(dx = 0.06f, dy = 0.1f)
                curveToRelative(dx1 = 0.48f, dy1 = 0.83f, dx2 = 1.26f, dy2 = 0.83f, dx3 = 1.74f, dy3 = 0.0f)
                lineToRelative(dx = 0.06f, dy = -0.1f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = -0.32f)
                lineToRelative(dx = 0.91f, dy = 0.53f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = 1.37f)
                curveToRelative(dx1 = -0.48f, dy1 = 0.83f, dx2 = -0.09f, dy2 = 1.51f, dx3 = 0.87f, dy3 = 1.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 0.93f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.68f, dx3 = -0.87f, dy3 = 1.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = 1.37f)
                lineToRelative(dx = -0.91f, dy = 0.53f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.21f, dy1 = -0.32f)
                lineToRelative(dx = -0.06f, dy = -0.1f)
                curveToRelative(dx1 = -0.48f, dy1 = -0.83f, dx2 = -1.26f, dy2 = -0.83f, dx3 = -1.74f, dy3 = 0.0f)
                lineToRelative(dx = -0.06f, dy = 0.1f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.21f, dy1 = 0.32f)
                lineToRelative(dx = -0.91f, dy = -0.53f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -1.37f)
                curveToRelative(dx1 = 0.48f, dy1 = -0.83f, dx2 = 0.09f, dy2 = -1.5f, dx3 = -0.87f, dy3 = -1.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
            }
        }.build().also { _cpuSetting = it }
    }

@Suppress("ObjectPropertyName")
private var _cpuSetting: ImageVector? = null
