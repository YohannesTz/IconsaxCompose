package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autobrightness: ImageVector
    get() {
        val current = _autobrightness
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Autobrightness",
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
                moveTo(x = 10.75f, y = 2.45f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.51f, dy1 = 0.0f)
                lineToRelative(dx = 1.58f, dy = 1.35f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.27f, dy1 = 0.46f)
                horizontalLineToRelative(dx = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.93f, dy1 = 1.93f)
                verticalLineToRelative(dy = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.21f, dy2 = 0.96f, dx3 = 0.46f, dy3 = 1.26f)
                lineToRelative(dx = 1.35f, dy = 1.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.51f)
                lineToRelative(dx = -1.35f, dy = 1.58f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.46f, dy1 = 1.26f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = 1.93f)
                horizontalLineToRelative(dx = -1.7f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = 0.46f)
                lineToRelative(dx = -1.58f, dy = 1.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.51f, dy1 = 0.0f)
                lineToRelative(dx = -1.58f, dy = -1.35f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = -0.46f)
                horizontalLineTo(x = 6.17f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = -1.93f)
                verticalLineToRelative(dy = -1.71f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.39f, dx2 = -0.2f, dy2 = -0.96f, dx3 = -0.45f, dy3 = -1.25f)
                lineToRelative(dx = -1.35f, dy = -1.59f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.5f)
                lineToRelative(dx = 1.35f, dy = -1.59f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.45f, dy1 = -1.25f)
                verticalLineTo(y = 6.2f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.93f, dy1 = -1.93f)
                horizontalLineTo(x = 7.9f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.96f, dy2 = -0.21f, dx3 = 1.26f, dy3 = -0.46f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineJoin = StrokeJoin.Bevel,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.5f, y = 15.94f)
                lineTo(x = 12.0f, y = 8.06f)
                lineToRelative(dx = 3.5f, dy = 7.88f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.75f, y = 13.3f)
                horizontalLineToRelative(dx = -3.5f)
            }
        }.build().also { _autobrightness = it }
    }

@Suppress("ObjectPropertyName")
private var _autobrightness: ImageVector? = null
