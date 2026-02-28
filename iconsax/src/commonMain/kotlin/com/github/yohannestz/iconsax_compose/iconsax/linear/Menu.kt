package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Menu: ImageVector
    get() {
        val current = _menu
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Menu",
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
                moveTo(x = 17.54f, y = 8.31f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.92f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.92f)
                moveToRelative(dx = -11.08f, dy = 0.0f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.92f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.92f)
                moveToRelative(dx = 11.08f, dy = 12.3f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.92f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.92f)
                moveToRelative(dx = -11.08f, dy = 0.0f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.92f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.92f)
            }
        }.build().also { _menu = it }
    }

@Suppress("ObjectPropertyName")
private var _menu: ImageVector? = null
